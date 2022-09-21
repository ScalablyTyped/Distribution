package typings.chui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface used to construct jQuery events (with $.Event). It is
  * defined separately instead of inline in JQueryStatic to allow
  * overriding the construction function with specific strings
  * returning specific event objects.
  */
@js.native
trait JQueryEventConstructor
  extends StObject
     with Instantiable1[/* name */ String, JQueryEventObject]
     with Instantiable2[/* name */ String, /* eventProperties */ Any, JQueryEventObject] {
  
  def apply(name: String): JQueryEventObject = js.native
  def apply(name: String, eventProperties: Any): JQueryEventObject = js.native
}
