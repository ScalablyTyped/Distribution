package typings.crossfilter

import org.scalablytyped.runtime.Shortcut
import typings.crossfilter.CrossFilter.CrossFilterStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("crossfilter", JSImport.Namespace)
  @js.native
  val ^ : CrossFilterStatic = js.native
  
  type _To = CrossFilterStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CrossFilterStatic = ^
}
