package typings.cradle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var continuous: js.UndefOr[Boolean] = js.undefined
    
    var create_target: js.UndefOr[Boolean] = js.undefined
    
    var doc_ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var query_params: js.UndefOr[js.Any] = js.undefined
    
    var source: String | Url
    
    var target: String | Url
  }
  object Cancel {
    
    inline def apply(source: String | Url, target: String | Url): Cancel = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      inline def setCreate_target(value: Boolean): Self = StObject.set(x, "create_target", value.asInstanceOf[js.Any])
      
      inline def setCreate_targetUndefined: Self = StObject.set(x, "create_target", js.undefined)
      
      inline def setDoc_ids(value: js.Array[String]): Self = StObject.set(x, "doc_ids", value.asInstanceOf[js.Any])
      
      inline def setDoc_idsUndefined: Self = StObject.set(x, "doc_ids", js.undefined)
      
      inline def setDoc_idsVarargs(value: String*): Self = StObject.set(x, "doc_ids", js.Array(value :_*))
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setQuery_params(value: js.Any): Self = StObject.set(x, "query_params", value.asInstanceOf[js.Any])
      
      inline def setQuery_paramsUndefined: Self = StObject.set(x, "query_params", js.undefined)
      
      inline def setSource(value: String | Url): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String | Url): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Descending extends StObject {
    
    var descending: js.UndefOr[Boolean] = js.undefined
    
    var endkey: js.UndefOr[js.Any] = js.undefined
    
    var group: js.UndefOr[Boolean] = js.undefined
    
    var include_docs: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var reduce: js.UndefOr[Boolean] = js.undefined
    
    var startkey: js.UndefOr[js.Any] = js.undefined
  }
  object Descending {
    
    inline def apply(): Descending = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Descending]
    }
    
    extension [Self <: Descending](x: Self) {
      
      inline def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
      
      inline def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
      
      inline def setEndkey(value: js.Any): Self = StObject.set(x, "endkey", value.asInstanceOf[js.Any])
      
      inline def setEndkeyUndefined: Self = StObject.set(x, "endkey", js.undefined)
      
      inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
      
      inline def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setReduce(value: Boolean): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setStartkey(value: js.Any): Self = StObject.set(x, "startkey", value.asInstanceOf[js.Any])
      
      inline def setStartkeyUndefined: Self = StObject.set(x, "startkey", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var rev: String
  }
  object Id {
    
    inline def apply(id: String, rev: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    }
  }
  
  trait Password extends StObject {
    
    var password: String
    
    var username: String
  }
  object Password {
    
    inline def apply(password: String, username: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
