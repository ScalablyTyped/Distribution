package typings.azureCoreHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcQueryCollectionFormatMod {
  
  @js.native
  sealed trait QueryCollectionFormat extends StObject
  @JSImport("@azure/core-http/types/latest/src/queryCollectionFormat", "QueryCollectionFormat")
  @js.native
  object QueryCollectionFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[QueryCollectionFormat & String] = js.native
    
    /**
      * CSV: Each pair of segments joined by a single comma.
      */
    @js.native
    sealed trait Csv
      extends StObject
         with QueryCollectionFormat
    /* "," */ val Csv: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Csv & String = js.native
    
    /**
      * Denotes this is an array of values that should be passed to the server in multiple key/value pairs, e.g. `?queryParam=value1&queryParam=value2`
      */
    @js.native
    sealed trait Multi
      extends StObject
         with QueryCollectionFormat
    /* "Multi" */ val Multi: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Multi & String = js.native
    
    /**
      * Pipes: Each pair of segments joined by a single pipe character.
      */
    @js.native
    sealed trait Pipes
      extends StObject
         with QueryCollectionFormat
    /* "|" */ val Pipes: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Pipes & String = js.native
    
    /**
      * SSV: Each pair of segments joined by a single space character.
      */
    @js.native
    sealed trait Ssv
      extends StObject
         with QueryCollectionFormat
    /* " " */ val Ssv: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Ssv & String = js.native
    
    /**
      * TSV: Each pair of segments joined by a single tab character.
      */
    @js.native
    sealed trait Tsv
      extends StObject
         with QueryCollectionFormat
    /* "\t" */ val Tsv: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Tsv & String = js.native
  }
}
