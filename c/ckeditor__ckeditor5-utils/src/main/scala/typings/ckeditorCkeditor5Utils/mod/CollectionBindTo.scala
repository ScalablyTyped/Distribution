package typings.ckeditorCkeditor5Utils.mod

import typings.ckeditorCkeditor5Utils.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionBindTo[T, K] extends StObject {
  
  def as(Class: Instantiable[T, K]): Unit = js.native
  
  def `using`(callbackOrProperty: /* keyof T */ String): Unit = js.native
  def `using`(callbackOrProperty: js.Function1[/* item */ T, K]): Unit = js.native
}
