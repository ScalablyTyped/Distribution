package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the context.
    */
  var ContextArn: js.UndefOr[typings.awsSdk.sagemakerMod.ContextArn] = js.undefined
  
  /**
    * The name of the context.
    */
  var ContextName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The type of the context.
    */
  var ContextType: js.UndefOr[String256] = js.undefined
  
  /**
    * When the context was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When the context was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The source of the context.
    */
  var Source: js.UndefOr[ContextSource] = js.undefined
}
object ContextSummary {
  
  inline def apply(): ContextSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextSummary]
  }
  
  extension [Self <: ContextSummary](x: Self) {
    
    inline def setContextArn(value: ContextArn): Self = StObject.set(x, "ContextArn", value.asInstanceOf[js.Any])
    
    inline def setContextArnUndefined: Self = StObject.set(x, "ContextArn", js.undefined)
    
    inline def setContextName(value: ExperimentEntityName): Self = StObject.set(x, "ContextName", value.asInstanceOf[js.Any])
    
    inline def setContextNameUndefined: Self = StObject.set(x, "ContextName", js.undefined)
    
    inline def setContextType(value: String256): Self = StObject.set(x, "ContextType", value.asInstanceOf[js.Any])
    
    inline def setContextTypeUndefined: Self = StObject.set(x, "ContextType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSource(value: ContextSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
