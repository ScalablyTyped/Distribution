package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestDNSAnswerResponse extends js.Object {
  
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
  implicit class TestDNSAnswerResponseOps[Self <: TestDNSAnswerResponse] (val x: Self) extends AnyVal {
    
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
    def setNameserver(value: Nameserver): Self = this.set("Nameserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: TransportProtocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordDataVarargs(value: RecordDataEntry*): Self = this.set("RecordData", js.Array(value :_*))
    
    @scala.inline
    def setRecordData(value: RecordData): Self = this.set("RecordData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordName(value: DNSName): Self = this.set("RecordName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordType(value: RRType): Self = this.set("RecordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: DNSRCode): Self = this.set("ResponseCode", value.asInstanceOf[js.Any])
  }
}
