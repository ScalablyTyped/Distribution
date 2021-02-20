package typings.awsSdkRoute53IdNormalizerMiddleware

import typings.awsSdkRoute53IdNormalizerMiddleware.mod.Change
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AliasTarget extends StObject {
    
    var AliasTarget: js.UndefOr[HostedZoneId] = js.native
  }
  object AliasTarget {
    
    @scala.inline
    def apply(): AliasTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasTarget]
    }
    
    @scala.inline
    implicit class AliasTargetMutableBuilder[Self <: AliasTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasTarget(value: HostedZoneId): Self = StObject.set(x, "AliasTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasTargetUndefined: Self = StObject.set(x, "AliasTarget", js.undefined)
    }
  }
  
  @js.native
  trait Changes extends StObject {
    
    var Changes: Iterable[Change] = js.native
  }
  object Changes {
    
    @scala.inline
    def apply(Changes: Iterable[Change]): Changes = {
      val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changes]
    }
    
    @scala.inline
    implicit class ChangesMutableBuilder[Self <: Changes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanges(value: Iterable[Change]): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HostedZoneId extends StObject {
    
    var HostedZoneId: String = js.native
  }
  object HostedZoneId {
    
    @scala.inline
    def apply(HostedZoneId: String): HostedZoneId = {
      val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedZoneId]
    }
    
    @scala.inline
    implicit class HostedZoneIdMutableBuilder[Self <: HostedZoneId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostedZoneId(value: String): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    }
  }
}
