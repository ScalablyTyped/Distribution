package typings.awsSdkRoute53IdNormalizerMiddleware

import typings.awsSdkRoute53IdNormalizerMiddleware.mod.Change
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AliasTarget] (val x: Self) extends AnyVal {
      
      inline def setAliasTarget(value: HostedZoneId): Self = StObject.set(x, "AliasTarget", value.asInstanceOf[js.Any])
      
      inline def setAliasTargetUndefined: Self = StObject.set(x, "AliasTarget", js.undefined)
    }
  }
  
  trait Changes extends StObject {
    
    var Changes: js.Iterable[Change]
  }
  object Changes {
    
    inline def apply(Changes: js.Iterable[Change]): Changes = {
      val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Changes] (val x: Self) extends AnyVal {
      
      inline def setChanges(value: js.Iterable[Change]): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostedZoneId] (val x: Self) extends AnyVal {
      
      inline def setHostedZoneId(value: String): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    }
  }
}
