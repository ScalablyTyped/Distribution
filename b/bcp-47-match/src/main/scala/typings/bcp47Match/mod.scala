package typings.bcp47Match

import typings.bcp47Match.bcp47MatchBooleans.`false`
import typings.bcp47Match.bcp47MatchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcp-47-match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def basicFilter(tags: String): Tags = ^.asInstanceOf[js.Dynamic].applyDynamic("basicFilter")(tags.asInstanceOf[js.Any]).asInstanceOf[Tags]
  inline def basicFilter(tags: String, ranges: String): Tags = (^.asInstanceOf[js.Dynamic].applyDynamic("basicFilter")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Tags]
  inline def basicFilter(tags: String, ranges: Ranges): Tags = (^.asInstanceOf[js.Dynamic].applyDynamic("basicFilter")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Tags]
  inline def basicFilter(tags: Tags): Tags = ^.asInstanceOf[js.Dynamic].applyDynamic("basicFilter")(tags.asInstanceOf[js.Any]).asInstanceOf[Tags]
  inline def basicFilter(tags: Tags, ranges: String): Tags = (^.asInstanceOf[js.Dynamic].applyDynamic("basicFilter")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Tags]
  inline def basicFilter(tags: Tags, ranges: Ranges): Tags = (^.asInstanceOf[js.Dynamic].applyDynamic("basicFilter")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Tags]
  
  inline def extendedFilter(tags: String): Tags = ^.asInstanceOf[js.Dynamic].applyDynamic("extendedFilter")(tags.asInstanceOf[js.Any]).asInstanceOf[Tags]
  inline def extendedFilter(tags: String, ranges: String): Tags = (^.asInstanceOf[js.Dynamic].applyDynamic("extendedFilter")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Tags]
  inline def extendedFilter(tags: String, ranges: Ranges): Tags = (^.asInstanceOf[js.Dynamic].applyDynamic("extendedFilter")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Tags]
  inline def extendedFilter(tags: Tags): Tags = ^.asInstanceOf[js.Dynamic].applyDynamic("extendedFilter")(tags.asInstanceOf[js.Any]).asInstanceOf[Tags]
  inline def extendedFilter(tags: Tags, ranges: String): Tags = (^.asInstanceOf[js.Dynamic].applyDynamic("extendedFilter")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Tags]
  inline def extendedFilter(tags: Tags, ranges: Ranges): Tags = (^.asInstanceOf[js.Dynamic].applyDynamic("extendedFilter")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Tags]
  
  inline def lookup(tags: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(tags.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def lookup(tags: String, ranges: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def lookup(tags: String, ranges: Ranges): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def lookup(tags: Tags): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(tags.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def lookup(tags: Tags, ranges: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def lookup(tags: Tags, ranges: Ranges): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(tags.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  type Check = js.Function2[/* tag */ Tag, /* range */ Range, Boolean]
  
  type Filter = FilterOrLookup[`true`]
  
  type FilterOrLookup[IsFilter /* <: Boolean */] = js.Function2[
    /* tags */ Tag | Tags, 
    /* ranges */ js.UndefOr[String | Ranges], 
    /* import warning: importer.ImportType#apply Failed type conversion: IsFilter extends true ? bcp-47-match.bcp-47-match.Tags : bcp-47-match.bcp-47-match.Tag | undefined */ js.Any
  ]
  
  type Lookup_ = FilterOrLookup[`false`]
  
  type Range = String
  
  type Ranges = js.Array[Range]
  
  type Tag = String
  
  type Tags = js.Array[Tag]
}
