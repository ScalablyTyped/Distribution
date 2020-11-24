package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalClusterMember extends js.Object {
  
  /**
    *  The Amazon Resource Name (ARN) for each Aurora cluster. 
    */
  var DBClusterArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not enabled, or is in the process of enabling it.
    */
  var GlobalWriteForwardingStatus: js.UndefOr[WriteForwardingStatus] = js.native
  
  /**
    *  Specifies whether the Aurora cluster is the primary cluster (that is, has read-write capability) for the Aurora global database with which it is associated. 
    */
  var IsWriter: js.UndefOr[Boolean] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the Aurora global database. 
    */
  var Readers: js.UndefOr[ReadersArnList] = js.native
}
object GlobalClusterMember {
  
  @scala.inline
  def apply(): GlobalClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalClusterMember]
  }
  
  @scala.inline
  implicit class GlobalClusterMemberOps[Self <: GlobalClusterMember] (val x: Self) extends AnyVal {
    
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
    def setDBClusterArn(value: String): Self = this.set("DBClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterArn: Self = this.set("DBClusterArn", js.undefined)
    
    @scala.inline
    def setGlobalWriteForwardingStatus(value: WriteForwardingStatus): Self = this.set("GlobalWriteForwardingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalWriteForwardingStatus: Self = this.set("GlobalWriteForwardingStatus", js.undefined)
    
    @scala.inline
    def setIsWriter(value: Boolean): Self = this.set("IsWriter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWriter: Self = this.set("IsWriter", js.undefined)
    
    @scala.inline
    def setReadersVarargs(value: String*): Self = this.set("Readers", js.Array(value :_*))
    
    @scala.inline
    def setReaders(value: ReadersArnList): Self = this.set("Readers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReaders: Self = this.set("Readers", js.undefined)
  }
}
