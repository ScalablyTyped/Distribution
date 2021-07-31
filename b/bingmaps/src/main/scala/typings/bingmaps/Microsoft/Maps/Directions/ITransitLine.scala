package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransitLine extends StObject {
  
  /** The short name for the transit line. */
  var abbreviatedName: String
  
  /** The ID of the agency that owns the transit line. */
  var agencyId: Double
  
  /** The name of the agency that owns the transit line. */
  var agencyName: String
  
  /** The URL of the website of the agency that owns the transit line. */
  var agencyUrl: String
  
  /** Phone number for the transit agency. */
  var phoneNumber: String
  
  /** Information about the provider of this transit line data. */
  var providerInfo: String
  
  /** The uri for the transit agencies website. */
  var uri: String
  
  /** The full name of this transit line. */
  var verboseName: String
}
object ITransitLine {
  
  @scala.inline
  def apply(
    abbreviatedName: String,
    agencyId: Double,
    agencyName: String,
    agencyUrl: String,
    phoneNumber: String,
    providerInfo: String,
    uri: String,
    verboseName: String
  ): ITransitLine = {
    val __obj = js.Dynamic.literal(abbreviatedName = abbreviatedName.asInstanceOf[js.Any], agencyId = agencyId.asInstanceOf[js.Any], agencyName = agencyName.asInstanceOf[js.Any], agencyUrl = agencyUrl.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], providerInfo = providerInfo.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], verboseName = verboseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransitLine]
  }
  
  @scala.inline
  implicit class ITransitLineMutableBuilder[Self <: ITransitLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbbreviatedName(value: String): Self = StObject.set(x, "abbreviatedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgencyId(value: Double): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgencyName(value: String): Self = StObject.set(x, "agencyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgencyUrl(value: String): Self = StObject.set(x, "agencyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderInfo(value: String): Self = StObject.set(x, "providerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseName(value: String): Self = StObject.set(x, "verboseName", value.asInstanceOf[js.Any])
  }
}
