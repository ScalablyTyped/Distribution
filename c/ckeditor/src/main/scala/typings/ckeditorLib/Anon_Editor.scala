package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Editor extends js.Object {
  def exec(editor: ckeditorLib.CKEDITORNs.editor): scala.Boolean
  def refresh(editor: ckeditorLib.CKEDITORNs.editor, path: ckeditorLib.CKEDITORNs.domNs.elementPath): scala.Double
}

object Anon_Editor {
  @scala.inline
  def apply(
    exec: js.Function1[ckeditorLib.CKEDITORNs.editor, scala.Boolean],
    refresh: js.Function2[
      ckeditorLib.CKEDITORNs.editor, 
      ckeditorLib.CKEDITORNs.domNs.elementPath, 
      scala.Double
    ]
  ): Anon_Editor = {
    val __obj = js.Dynamic.literal(exec = exec, refresh = refresh)
  
    __obj.asInstanceOf[Anon_Editor]
  }
}

