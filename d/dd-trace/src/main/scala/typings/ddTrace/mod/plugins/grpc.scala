package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [grpc](https://github.com/grpc/grpc-node) module.
  */
trait grpc extends Grpc_ {
  /**
    * Configuration for gRPC clients.
    */
  var client: js.UndefOr[Grpc_] = js.undefined
  /**
    * Configuration for gRPC servers.
    */
  var server: js.UndefOr[Grpc_] = js.undefined
}

object grpc {
  @scala.inline
  def apply(
    analytics: Boolean | Double | (StringDictionary[Boolean | Double]) = null,
    client: Grpc_ = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]]) = null,
    server: Grpc_ = null,
    service: String = null
  ): grpc = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[grpc]
  }
}

