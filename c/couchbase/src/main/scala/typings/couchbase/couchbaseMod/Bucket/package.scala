package typings.couchbase.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Bucket {
  import typings.couchbase.couchbaseMod.Bucket.FtsQueryResponse.Meta
  import typings.couchbase.couchbaseMod.CouchbaseError

  /**
    * Transcoder Decoding Function.
    * This function will receive an object containing a Buffer value and an integer value representing any flags metadata whenever a retrieval operation is executed. It is expected that this function will return a value representing the original value stored and encoded with its matching EncoderFunction.
    */
  type DecoderFunction = js.Function1[/* doc */ TranscoderDoc, js.Any]
  /**
    * Transcoder Encoding Function.
    * This function will receive a value when a storage operation is invoked that needs to encode user-provided data for storage into Couchbase. It expects to be returned a Buffer object to store along with an integer representing any flag metadata relating to how to decode the key later using the matching DecoderFunction.
    */
  type EncoderFunction = js.Function1[/* value */ js.Any, TranscoderDoc]
  /**
    * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
    */
  type FtsQueryCallback = js.Function3[
    /* error */ CouchbaseError | Null, 
    /* rows */ js.Array[js.Any] | Null, 
    /* meta */ Meta, 
    Unit
  ]
  type FtsQueryResponse = FtsQueryResponse_
  /**
    * Multi-Get Callback.
    * This callback is used to return results from a getMulti operation.
    */
  type MultiGetCallback = js.Function2[/* error */ Double, /* results */ js.Array[js.Any], Unit]
  /**
    * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
    */
  type N1qlQueryCallback = js.Function3[
    /* error */ CouchbaseError | Null, 
    /* rows */ js.Array[js.Any] | Null, 
    /* meta */ typings.couchbase.couchbaseMod.Bucket.N1qlQueryResponse.Meta, 
    Unit
  ]
  type N1qlQueryResponse = N1qlQueryResponse_
  /**
    * Single-Key callbacks.
    * This callback is passed to all of the single key functions.
    * It returns a result objcet containing a combination of a CAS and a value, depending on which operation was invoked.
    */
  type OpCallback = js.Function2[/* error */ CouchbaseError | Null, /* result */ js.Any, Unit]
  /**
    * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
    */
  type QueryCallback = js.Function3[
    /* error */ CouchbaseError | Null, 
    /* rows */ js.Array[js.Any] | Null, 
    /* meta */ typings.couchbase.couchbaseMod.Bucket.ViewQueryResponse.Meta, 
    Unit
  ]
  type ViewQueryResponse = ViewQueryResponse_
}
