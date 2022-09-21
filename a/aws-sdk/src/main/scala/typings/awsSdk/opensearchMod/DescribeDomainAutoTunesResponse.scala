package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainAutoTunesResponse extends StObject {
  
  /**
    * The list of setting adjustments that Auto-Tune has made to the domain. See  Auto-Tune for Amazon OpenSearch Service  for more information. 
    */
  var AutoTunes: js.UndefOr[AutoTuneList] = js.undefined
  
  /**
    * An identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.opensearchMod.NextToken] = js.undefined
}
object DescribeDomainAutoTunesResponse {
  
  inline def apply(): DescribeDomainAutoTunesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainAutoTunesResponse]
  }
  
  extension [Self <: DescribeDomainAutoTunesResponse](x: Self) {
    
    inline def setAutoTunes(value: AutoTuneList): Self = StObject.set(x, "AutoTunes", value.asInstanceOf[js.Any])
    
    inline def setAutoTunesUndefined: Self = StObject.set(x, "AutoTunes", js.undefined)
    
    inline def setAutoTunesVarargs(value: AutoTune*): Self = StObject.set(x, "AutoTunes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
