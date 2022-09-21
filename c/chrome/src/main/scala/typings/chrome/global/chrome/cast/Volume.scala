package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.Volume")
@js.native
/**
  * @param opt_level
  * @param opt_muted
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Volume
  */
open class Volume ()
  extends StObject
     with typings.chrome.chrome.cast.Volume {
  def this(level: Double) = this()
  def this(level: Double, muted: Boolean) = this()
  def this(level: Unit, muted: Boolean) = this()
  
  /* CompleteClass */
  var level: Double | Null = js.native
  
  /* CompleteClass */
  var muted: Boolean | Null = js.native
}
