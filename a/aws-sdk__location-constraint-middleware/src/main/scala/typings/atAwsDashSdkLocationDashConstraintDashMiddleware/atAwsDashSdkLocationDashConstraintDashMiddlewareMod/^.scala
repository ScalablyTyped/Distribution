package typings.atAwsDashSdkLocationDashConstraintDashMiddleware.atAwsDashSdkLocationDashConstraintDashMiddlewareMod

import typings.atAwsDashSdkTypes.buildMiddlewareMod.Middleware
import typings.atAwsDashSdkTypes.buildUtilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/location-constraint-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def locationConstraintMiddleware[Input /* <: LocationConstraintAwareInput */, Output /* <: js.Object */](regionProvider: Provider[String]): Middleware[Input, Output] = js.native
}

