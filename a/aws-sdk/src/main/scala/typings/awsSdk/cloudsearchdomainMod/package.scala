package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Adds = scala.Double

type BucketList = js.Array[Bucket]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.applicationSlashjson
  - typings.awsSdk.awsSdkStrings.applicationSlashxml
  - java.lang.String
*/
type ContentType = _ContentType | java.lang.String

type Cursor = java.lang.String

type Deletes = scala.Double

type DocumentServiceWarnings = js.Array[DocumentServiceWarning]

type Double = scala.Double

type Expr = java.lang.String

type Exprs = StringDictionary[String]

type Facet = java.lang.String

type Facets = StringDictionary[BucketInfo]

type FieldValue = js.Array[String]

type Fields = StringDictionary[FieldValue]

type FilterQuery = java.lang.String

type Highlight = java.lang.String

type Highlights = StringDictionary[String]

type HitList = js.Array[Hit]

type Long = scala.Double

type Partial = Boolean

type Query = java.lang.String

type QueryOptions = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.simple_
  - typings.awsSdk.awsSdkStrings.structured
  - typings.awsSdk.awsSdkStrings.lucene
  - typings.awsSdk.awsSdkStrings.dismax
  - java.lang.String
*/
type QueryParser = _QueryParser | java.lang.String

type Return = java.lang.String

type Size = scala.Double

type Sort = java.lang.String

type Start = scala.Double

type Stat = java.lang.String

type Stats = StringDictionary[FieldStats]

type String = java.lang.String

type Suggester = java.lang.String

type Suggestions = js.Array[SuggestionMatch]

type SuggestionsSize = scala.Double

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2013-01-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
