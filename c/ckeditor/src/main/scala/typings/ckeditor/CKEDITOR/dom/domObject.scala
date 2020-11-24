package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait domObject
  extends typings.ckeditor.CKEDITOR.event {
  
  @JSName("$")
  val $: js.Any = js.native
  
  def clearCustomData(): Unit = js.native
  
  def equals(`object`: js.Any): Boolean = js.native
  
  def getCustomData(key: String): js.Any = js.native
  
  def getPrivate(): js.Any = js.native
  
  def getUniqueId(): Double = js.native
  
  def removeCustomData(key: String): js.Any = js.native
  
  def setCustomData(key: String, value: js.Any): domObject = js.native
}
