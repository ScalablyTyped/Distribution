package typings.classnames

import org.scalablytyped.runtime.Shortcut
import typings.classnames.typesMod.ClassNamesExport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dedupeMod extends Shortcut {
  
  @JSImport("classnames/dedupe", JSImport.Namespace)
  @js.native
  val ^ : ClassNamesExport = js.native
  
  type _To = ClassNamesExport
  
  /* This means you don't have to write `^`, but can instead just say `dedupeMod.foo` */
  override def _to: ClassNamesExport = ^
}
