package typings.cloudmersiveVirusApiClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollectionFormatEnum extends js.Object

@JSImport("cloudmersive-virus-api-client", "CollectionFormatEnum")
@js.native
object CollectionFormatEnum extends js.Object {
  /**
    * Comma-separated values. Value: <code>csv</code>
    */
  @js.native
  sealed trait CSV extends CollectionFormatEnum
  
  /**
    * Native array. Value: <code>multi</code>
    */
  @js.native
  sealed trait MULTI extends CollectionFormatEnum
  
  /**
    * Pipe(|)-separated values. Value: <code>pipes</code>
    */
  @js.native
  sealed trait PIPES extends CollectionFormatEnum
  
  /**
    * Space-separated values. Value: <code>ssv</code>
    */
  @js.native
  sealed trait SSV extends CollectionFormatEnum
  
  /**
    * Tab-separated values. Value: <code>tsv</code>
    */
  @js.native
  sealed trait TSV extends CollectionFormatEnum
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CollectionFormatEnum with String] = js.native
  /* "," */ @js.native
  object CSV extends TopLevel[CSV with String]
  
  /* "multi" */ @js.native
  object MULTI extends TopLevel[MULTI with String]
  
  /* "|" */ @js.native
  object PIPES extends TopLevel[PIPES with String]
  
  /* " " */ @js.native
  object SSV extends TopLevel[SSV with String]
  
  /* "\t" */ @js.native
  object TSV extends TopLevel[TSV with String]
  
}

