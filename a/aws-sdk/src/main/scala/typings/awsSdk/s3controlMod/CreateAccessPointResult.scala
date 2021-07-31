package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPointResult extends StObject {
  
  /**
    * The ARN of the access point.  This is only supported by Amazon S3 on Outposts. 
    */
  var AccessPointArn: js.UndefOr[S3AccessPointArn] = js.undefined
}
object CreateAccessPointResult {
  
  @scala.inline
  def apply(): CreateAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessPointResult]
  }
  
  @scala.inline
  implicit class CreateAccessPointResultMutableBuilder[Self <: CreateAccessPointResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointArn(value: S3AccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
  }
}
