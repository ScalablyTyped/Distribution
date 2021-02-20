package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalClusterMember extends StObject {
  
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
  implicit class GlobalClusterMemberMutableBuilder[Self <: GlobalClusterMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterArn(value: String): Self = StObject.set(x, "DBClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterArnUndefined: Self = StObject.set(x, "DBClusterArn", js.undefined)
    
    @scala.inline
    def setGlobalWriteForwardingStatus(value: WriteForwardingStatus): Self = StObject.set(x, "GlobalWriteForwardingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalWriteForwardingStatusUndefined: Self = StObject.set(x, "GlobalWriteForwardingStatus", js.undefined)
    
    @scala.inline
    def setIsWriter(value: Boolean): Self = StObject.set(x, "IsWriter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWriterUndefined: Self = StObject.set(x, "IsWriter", js.undefined)
    
    @scala.inline
    def setReaders(value: ReadersArnList): Self = StObject.set(x, "Readers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadersUndefined: Self = StObject.set(x, "Readers", js.undefined)
    
    @scala.inline
    def setReadersVarargs(value: String*): Self = StObject.set(x, "Readers", js.Array(value :_*))
  }
}
