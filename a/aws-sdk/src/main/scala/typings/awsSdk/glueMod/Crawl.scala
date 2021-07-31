package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crawl extends StObject {
  
  /**
    * The date and time on which the crawl completed.
    */
  var CompletedOn: js.UndefOr[TimestampValue] = js.undefined
  
  /**
    * The error message associated with the crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The log group associated with the crawl.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.glueMod.LogGroup] = js.undefined
  
  /**
    * The log stream associated with the crawl.
    */
  var LogStream: js.UndefOr[typings.awsSdk.glueMod.LogStream] = js.undefined
  
  /**
    * The date and time on which the crawl started.
    */
  var StartedOn: js.UndefOr[TimestampValue] = js.undefined
  
  /**
    * The state of the crawler.
    */
  var State: js.UndefOr[CrawlState] = js.undefined
}
object Crawl {
  
  @scala.inline
  def apply(): Crawl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crawl]
  }
  
  @scala.inline
  implicit class CrawlMutableBuilder[Self <: Crawl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedOn(value: TimestampValue): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: DescriptionString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setLogGroup(value: LogGroup): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
    
    @scala.inline
    def setLogStream(value: LogStream): Self = StObject.set(x, "LogStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamUndefined: Self = StObject.set(x, "LogStream", js.undefined)
    
    @scala.inline
    def setStartedOn(value: TimestampValue): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    @scala.inline
    def setState(value: CrawlState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
