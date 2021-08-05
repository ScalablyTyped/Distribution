package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListArchivesRequest extends StObject {
  
  /**
    * The ARN of the event source associated with the archive.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * A name prefix to filter the archives returned. Only archives with name that match the prefix are returned.
    */
  var NamePrefix: js.UndefOr[ArchiveName] = js.undefined
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.undefined
  
  /**
    * The state of the archive.
    */
  var State: js.UndefOr[ArchiveState] = js.undefined
}
object ListArchivesRequest {
  
  inline def apply(): ListArchivesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListArchivesRequest]
  }
  
  extension [Self <: ListArchivesRequest](x: Self) {
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    inline def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNamePrefix(value: ArchiveName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setState(value: ArchiveState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
