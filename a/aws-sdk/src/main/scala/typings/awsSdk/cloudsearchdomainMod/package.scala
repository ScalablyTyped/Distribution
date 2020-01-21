package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudsearchdomainMod {
  type Adds = scala.Double
  type BucketList = js.Array[typings.awsSdk.cloudsearchdomainMod.Bucket]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloudsearchdomainMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.applicationSlashjson
    - typings.awsSdk.awsSdkStrings.applicationSlashxml
    - java.lang.String
  */
  type ContentType = typings.awsSdk.cloudsearchdomainMod._ContentType | java.lang.String
  type Cursor = java.lang.String
  type Deletes = scala.Double
  type DocumentServiceWarnings = js.Array[typings.awsSdk.cloudsearchdomainMod.DocumentServiceWarning]
  type Double = scala.Double
  type Expr = java.lang.String
  type Exprs = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudsearchdomainMod.String]
  type Facet = java.lang.String
  type Facets = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudsearchdomainMod.BucketInfo]
  type FieldValue = js.Array[typings.awsSdk.cloudsearchdomainMod.String]
  type Fields = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudsearchdomainMod.FieldValue]
  type FilterQuery = java.lang.String
  type Highlight = java.lang.String
  type Highlights = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudsearchdomainMod.String]
  type HitList = js.Array[typings.awsSdk.cloudsearchdomainMod.Hit]
  type Long = scala.Double
  type Partial = scala.Boolean
  type Query = java.lang.String
  type QueryOptions = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.simple_
    - typings.awsSdk.awsSdkStrings.structured
    - typings.awsSdk.awsSdkStrings.lucene
    - typings.awsSdk.awsSdkStrings.dismax
    - java.lang.String
  */
  type QueryParser = typings.awsSdk.cloudsearchdomainMod._QueryParser | java.lang.String
  type Return = java.lang.String
  type Size = scala.Double
  type Sort = java.lang.String
  type Start = scala.Double
  type Stat = java.lang.String
  type Stats = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudsearchdomainMod.FieldStats]
  type String = java.lang.String
  type Suggester = java.lang.String
  type Suggestions = js.Array[typings.awsSdk.cloudsearchdomainMod.SuggestionMatch]
  type SuggestionsSize = scala.Double
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.cloudsearchdomainMod.Blob | java.lang.String | typings.node.streamMod.Readable
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2013-01-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloudsearchdomainMod._apiVersion | java.lang.String
}
