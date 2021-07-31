package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterVolumeResult extends StObject {
  
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}
object RegisterVolumeResult {
  
  @scala.inline
  def apply(): RegisterVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterVolumeResult]
  }
  
  @scala.inline
  implicit class RegisterVolumeResultMutableBuilder[Self <: RegisterVolumeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
