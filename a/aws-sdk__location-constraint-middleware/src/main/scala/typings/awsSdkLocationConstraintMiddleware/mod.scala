package typings.awsSdkLocationConstraintMiddleware

import typings.awsSdkLocationConstraintMiddleware.anon.LocationConstraint
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/location-constraint-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def locationConstraintMiddleware[Input /* <: LocationConstraintAwareInput */, Output /* <: js.Object */](regionProvider: Provider[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("locationConstraintMiddleware")(regionProvider.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait LocationConstraintAwareInput extends StObject {
    
    var CreateBucketConfiguration: js.UndefOr[LocationConstraint] = js.undefined
  }
  object LocationConstraintAwareInput {
    
    @scala.inline
    def apply(): LocationConstraintAwareInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationConstraintAwareInput]
    }
    
    @scala.inline
    implicit class LocationConstraintAwareInputMutableBuilder[Self <: LocationConstraintAwareInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateBucketConfiguration(value: LocationConstraint): Self = StObject.set(x, "CreateBucketConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateBucketConfigurationUndefined: Self = StObject.set(x, "CreateBucketConfiguration", js.undefined)
    }
  }
}
