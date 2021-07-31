package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDsn extends StObject {
  
  /**
    * When the message was received by the reporting mail transfer agent (MTA), in RFC 822 date-time format.
    */
  var ArrivalDate: js.UndefOr[typings.awsSdk.sesMod.ArrivalDate] = js.undefined
  
  /**
    * Additional X-headers to include in the DSN.
    */
  var ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined
  
  /**
    * The reporting MTA that attempted to deliver the message, formatted as specified in RFC 3464 (mta-name-type; mta-name). The default value is dns; inbound-smtp.[region].amazonaws.com.
    */
  var ReportingMta: typings.awsSdk.sesMod.ReportingMta
}
object MessageDsn {
  
  @scala.inline
  def apply(ReportingMta: ReportingMta): MessageDsn = {
    val __obj = js.Dynamic.literal(ReportingMta = ReportingMta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDsn]
  }
  
  @scala.inline
  implicit class MessageDsnMutableBuilder[Self <: MessageDsn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrivalDate(value: ArrivalDate): Self = StObject.set(x, "ArrivalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrivalDateUndefined: Self = StObject.set(x, "ArrivalDate", js.undefined)
    
    @scala.inline
    def setExtensionFields(value: ExtensionFieldList): Self = StObject.set(x, "ExtensionFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionFieldsUndefined: Self = StObject.set(x, "ExtensionFields", js.undefined)
    
    @scala.inline
    def setExtensionFieldsVarargs(value: ExtensionField*): Self = StObject.set(x, "ExtensionFields", js.Array(value :_*))
    
    @scala.inline
    def setReportingMta(value: ReportingMta): Self = StObject.set(x, "ReportingMta", value.asInstanceOf[js.Any])
  }
}
