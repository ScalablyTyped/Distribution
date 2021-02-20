package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bumper extends StObject {
  
  /**
    * The URL for the end bumper asset. 
    */
  var EndUrl: js.UndefOr[string] = js.native
  
  /**
    * The URL for the start bumper asset. 
    */
  var StartUrl: js.UndefOr[string] = js.native
}
object Bumper {
  
  @scala.inline
  def apply(): Bumper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bumper]
  }
  
  @scala.inline
  implicit class BumperMutableBuilder[Self <: Bumper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndUrl(value: string): Self = StObject.set(x, "EndUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUrlUndefined: Self = StObject.set(x, "EndUrl", js.undefined)
    
    @scala.inline
    def setStartUrl(value: string): Self = StObject.set(x, "StartUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUrlUndefined: Self = StObject.set(x, "StartUrl", js.undefined)
  }
}
