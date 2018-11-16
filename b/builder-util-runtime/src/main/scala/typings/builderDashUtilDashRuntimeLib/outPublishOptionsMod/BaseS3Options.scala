package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseS3Options extends PublishConfiguration {
  /**
       * The ACL. Set to `null` to not [add](https://github.com/electron-userland/electron-builder/issues/1822).
       *
       * @default public-read
       */
  val acl: js.UndefOr[
    builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`private` | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`public-read` | scala.Null
  ] = js.undefined
  /**
       * The update channel.
       * @default latest
       */
  var channel: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The directory path.
       * @default /
       */
  val path: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

