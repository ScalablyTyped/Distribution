package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Bucket {
  
  /**
    * Transcoder Decoding Function.
    * This function will receive an object containing a Buffer value and an integer value representing any flags metadata whenever a retrieval operation is executed. It is expected that this function will return a value representing the original value stored and encoded with its matching EncoderFunction.
    */
  type DecoderFunction = js.Function1[/* doc */ typings.couchbase.mod.Bucket.TranscoderDoc, js.Any]
  
  /**
    * Transcoder Encoding Function.
    * This function will receive a value when a storage operation is invoked that needs to encode user-provided data for storage into Couchbase. It expects to be returned a Buffer object to store along with an integer representing any flag metadata relating to how to decode the key later using the matching DecoderFunction.
    */
  type EncoderFunction = js.Function1[/* value */ js.Any, typings.couchbase.mod.Bucket.TranscoderDoc]
  
  /**
    * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
    */
  type FtsQueryCallback = js.Function3[
    /* error */ typings.couchbase.mod.CouchbaseError | scala.Null, 
    /* rows */ js.Array[js.Any] | scala.Null, 
    /* meta */ typings.couchbase.mod.Bucket.FtsQueryResponse.Meta, 
    scala.Unit
  ]
  
  type FtsQueryResponse = typings.couchbase.mod.Bucket.FtsQueryResponse_
  
  /**
    * Multi-Get Callback.
    * This callback is used to return results from a getMulti operation.
    */
  type MultiGetCallback = js.Function2[/* error */ scala.Double, /* results */ js.Array[js.Any], scala.Unit]
  
  /**
    * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
    */
  type N1qlQueryCallback = js.Function3[
    /* error */ typings.couchbase.mod.CouchbaseError | scala.Null, 
    /* rows */ js.Array[js.Any] | scala.Null, 
    /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
    scala.Unit
  ]
  
  type N1qlQueryResponse = typings.couchbase.mod.Bucket.N1qlQueryResponse_
  
  /**
    * Single-Key callbacks.
    * This callback is passed to all of the single key functions.
    * It returns a result objcet containing a combination of a CAS and a value, depending on which operation was invoked.
    */
  type OpCallback = js.Function2[
    /* error */ typings.couchbase.mod.CouchbaseError | scala.Null, 
    /* result */ js.Any, 
    scala.Unit
  ]
  
  /**
    * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
    */
  type QueryCallback = js.Function3[
    /* error */ typings.couchbase.mod.CouchbaseError | scala.Null, 
    /* rows */ js.Array[js.Any] | scala.Null, 
    /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
    scala.Unit
  ]
  
  type ViewQueryResponse = typings.couchbase.mod.Bucket.ViewQueryResponse_
}
