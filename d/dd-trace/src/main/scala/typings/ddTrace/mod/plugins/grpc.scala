package typings.ddTrace.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [grpc](https://github.com/grpc/grpc-node) module.
  */
@js.native
trait grpc extends Grpc_ {
  /**
    * Configuration for gRPC clients.
    */
  var client: js.UndefOr[Grpc_] = js.native
  /**
    * Configuration for gRPC servers.
    */
  var server: js.UndefOr[Grpc_] = js.native
}

object grpc {
  @scala.inline
  def apply(): grpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[grpc]
  }
  @scala.inline
  implicit class grpcOps[Self <: grpc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient(value: Grpc_): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setServer(value: Grpc_): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}

