package typings.awsSdkTypes

import typings.awsSdkTypes.clientMod.Client
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  trait PaginationConfiguration extends StObject {
    
    var client: Client[js.Any, js.Any, js.Any]
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var startingToken: js.UndefOr[String] = js.undefined
  }
  object PaginationConfiguration {
    
    @scala.inline
    def apply(client: Client[js.Any, js.Any, js.Any]): PaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationConfiguration]
    }
    
    @scala.inline
    implicit class PaginationConfigurationMutableBuilder[Self <: PaginationConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Client[js.Any, js.Any, js.Any]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setStartingToken(value: String): Self = StObject.set(x, "startingToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingTokenUndefined: Self = StObject.set(x, "startingToken", js.undefined)
    }
  }
  
  type Paginator[T] = AsyncGenerator[T, T, js.Any]
}
