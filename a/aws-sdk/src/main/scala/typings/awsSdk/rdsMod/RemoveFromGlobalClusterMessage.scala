package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFromGlobalClusterMessage extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster. 
    */
  var DbClusterIdentifier: js.UndefOr[String] = js.native
  /**
    *  The cluster identifier to detach from the Aurora global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
}

object RemoveFromGlobalClusterMessage {
  @scala.inline
  def apply(): RemoveFromGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFromGlobalClusterMessage]
  }
  @scala.inline
  implicit class RemoveFromGlobalClusterMessageOps[Self <: RemoveFromGlobalClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDbClusterIdentifier(value: String): Self = this.set("DbClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbClusterIdentifier: Self = this.set("DbClusterIdentifier", js.undefined)
    @scala.inline
    def setGlobalClusterIdentifier(value: String): Self = this.set("GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusterIdentifier: Self = this.set("GlobalClusterIdentifier", js.undefined)
  }
  
}

