package typings.cacheableLookup

import typings.cacheableLookup.mod.EntrySource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheableLookupStrings {
  
  @js.native
  sealed trait cache
    extends StObject
       with EntrySource
  inline def cache: cache = "cache".asInstanceOf[cache]
  
  @js.native
  sealed trait query
    extends StObject
       with EntrySource
  inline def query: query = "query".asInstanceOf[query]
}
