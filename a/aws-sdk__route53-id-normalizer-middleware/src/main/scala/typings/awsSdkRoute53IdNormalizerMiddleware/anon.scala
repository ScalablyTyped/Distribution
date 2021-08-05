package typings.awsSdkRoute53IdNormalizerMiddleware

import typings.awsSdkRoute53IdNormalizerMiddleware.mod.Change
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AliasTarget extends StObject {
    
    var AliasTarget: js.UndefOr[HostedZoneId] = js.undefined
  }
  object AliasTarget {
    
    inline def apply(): AliasTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasTarget]
    }
    
    extension [Self <: AliasTarget](x: Self) {
      
      inline def setAliasTarget(value: HostedZoneId): Self = StObject.set(x, "AliasTarget", value.asInstanceOf[js.Any])
      
      inline def setAliasTargetUndefined: Self = StObject.set(x, "AliasTarget", js.undefined)
    }
  }
  
  trait Changes extends StObject {
    
    var Changes: Iterable[Change]
  }
  object Changes {
    
    inline def apply(Changes: Iterable[Change]): Changes = {
      val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changes]
    }
    
    extension [Self <: Changes](x: Self) {
      
      inline def setChanges(value: Iterable[Change]): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedZoneId extends StObject {
    
    var HostedZoneId: String
  }
  object HostedZoneId {
    
    inline def apply(HostedZoneId: String): HostedZoneId = {
      val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedZoneId]
    }
    
    extension [Self <: HostedZoneId](x: Self) {
      
      inline def setHostedZoneId(value: String): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    }
  }
}
