package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BintrayOptions extends PublishConfiguration {
  /**
    * The Bintray component (Debian only).
    */
  val component: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The Bintray distribution (Debian only).
    * @default stable
    */
  val distribution: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The owner.
    */
  val owner: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The Bintray package name.
    */
  val `package`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The provider. Must be `bintray`.
    */
  @JSName("provider")
  val provider_BintrayOptions: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.bintray
  /**
    * The Bintray repository name.
    * @default generic
    */
  val repo: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val token: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The Bintray user account. Used in cases where the owner is an organization.
    */
  val user: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

