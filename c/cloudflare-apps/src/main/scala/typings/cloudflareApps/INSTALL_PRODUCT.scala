package typings.cloudflareApps

import org.scalablytyped.runtime.TopLevel
import typings.cloudflareApps.CloudflareApps.InstallProduct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is specific to paid apps. It allows you to know which product the user has purchased.
  * When you create a paid app you will be given product ids for each of the plans you wish to sell the product for.
  * `INSTALL_PRODUCT.id` will then be that id for the plan the user has purchased.
  * This value is absent for free apps and will always be set for paid apps even if the user is on a free plan.
  */
@JSGlobal("INSTALL_PRODUCT")
@js.native
object INSTALL_PRODUCT
  extends TopLevel[js.UndefOr[InstallProduct]]

