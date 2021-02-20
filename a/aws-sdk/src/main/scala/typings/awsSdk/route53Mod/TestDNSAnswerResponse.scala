package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestDNSAnswerResponse extends StObject {
  
  /**
    * The Amazon Route 53 name server used to respond to the request.
    */
  var Nameserver: typings.awsSdk.route53Mod.Nameserver = js.native
  
  /**
    * The protocol that Amazon Route 53 used to respond to the request, either UDP or TCP. 
    */
  var Protocol: TransportProtocol = js.native
  
  /**
    * A list that contains values that Amazon Route 53 returned for this resource record set.
    */
  var RecordData: typings.awsSdk.route53Mod.RecordData = js.native
  
  /**
    * The name of the resource record set that you submitted a request for.
    */
  var RecordName: DNSName = js.native
  
  /**
    * The type of the resource record set that you submitted a request for.
    */
  var RecordType: RRType = js.native
  
  /**
    * A code that indicates whether the request is valid or not. The most common response code is NOERROR, meaning that the request is valid. If the response is not valid, Amazon Route 53 returns a response code that describes the error. For a list of possible response codes, see DNS RCODES on the IANA website. 
    */
  var ResponseCode: DNSRCode = js.native
}
object TestDNSAnswerResponse {
  
  @scala.inline
  def apply(
    Nameserver: Nameserver,
    Protocol: TransportProtocol,
    RecordData: RecordData,
    RecordName: DNSName,
    RecordType: RRType,
    ResponseCode: DNSRCode
  ): TestDNSAnswerResponse = {
    val __obj = js.Dynamic.literal(Nameserver = Nameserver.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], RecordData = RecordData.asInstanceOf[js.Any], RecordName = RecordName.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], ResponseCode = ResponseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDNSAnswerResponse]
  }
  
  @scala.inline
  implicit class TestDNSAnswerResponseMutableBuilder[Self <: TestDNSAnswerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameserver(value: Nameserver): Self = StObject.set(x, "Nameserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: TransportProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordData(value: RecordData): Self = StObject.set(x, "RecordData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordDataVarargs(value: RecordDataEntry*): Self = StObject.set(x, "RecordData", js.Array(value :_*))
    
    @scala.inline
    def setRecordName(value: DNSName): Self = StObject.set(x, "RecordName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordType(value: RRType): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: DNSRCode): Self = StObject.set(x, "ResponseCode", value.asInstanceOf[js.Any])
  }
}
