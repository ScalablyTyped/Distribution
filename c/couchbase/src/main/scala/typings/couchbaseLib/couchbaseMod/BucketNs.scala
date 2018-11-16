package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "Bucket")
@js.native
object BucketNs extends js.Object {
  /**
       * The CAS value is a special object that indicates the current state of the item on the server. Each time an object is mutated on the server, the value is changed. CAS objects can be used in conjunction with mutation operations to ensure that the value on the server matches the local value retrieved by the client. This is useful when doing document updates on the server as you can ensure no changes were applied by other clients while you were in the process of mutating the document locally.
       * In the Node.js SDK, the CAS is represented as an opaque value. As such, you cannot generate CAS objects, but should rather use the values returned from a Bucket.OpCallback.
       */
  
  trait CAS extends js.Object
  
  /**
       * An event emitter allowing you to bind to various query result set events.
       */
  @js.native
  trait FtsQueryResponse
    extends nodeLib.eventsMod.EventEmitter {
    @JSName("addListener")
    def addListener_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("on")
    def on_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("once")
    def once_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("once")
    def once_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
  }
  
  /**
       * An event emitter allowing you to bind to various query result set events.
       */
  @js.native
  trait N1qlQueryResponse
    extends nodeLib.eventsMod.EventEmitter {
    @JSName("addListener")
    def addListener_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("on")
    def on_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("once")
    def once_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("once")
    def once_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
  }
  
  /**
       * A class used in relation to transcoders.
       */
  @js.native
  class TranscoderDoc () extends js.Object {
    var flags: scala.Double = js.native
    var value: nodeLib.Buffer = js.native
  }
  
  /**
       * An event emitter allowing you to bind to various query result set events.
       */
  @js.native
  trait ViewQueryResponse
    extends nodeLib.eventsMod.EventEmitter {
    @JSName("addListener")
    def addListener_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("on")
    def on_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("once")
    def once_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("once")
    def once_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(
      event: couchbaseLib.couchbaseLibStrings.end,
      listener: js.Function1[/* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, scala.Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(
      event: couchbaseLib.couchbaseLibStrings.error,
      listener: js.Function1[/* error */ couchbaseLib.couchbaseMod.CouchbaseError, scala.Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_row(
      event: couchbaseLib.couchbaseLibStrings.row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_rows(
      event: couchbaseLib.couchbaseLibStrings.rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
          scala.Unit
        ]
    ): this.type = js.native
  }
  
  @JSName("FtsQueryResponse")
  @js.native
  object FtsQueryResponseNs extends js.Object {
    /**
             * The meta-information available from a search query response.
             */
    
    trait Meta extends js.Object {
      /**
                   * Any non-fatal errors that occurred during query processing.
                   */
      var errors: js.Any
      /**
                   * The resulting facet information for any facets that were specified
                   * in the search query.
                   */
      var facets: js.Any
      /**
                   * The maximum score out of all the results in this query.
                   */
      var maxScore: scala.Double
      /**
                   * The status information for this query, includes properties
                   * such as total, failed, and successful.
                   */
      var status: js.Any
      /**
                   * The time spent processing this query.
                   */
      var took: scala.Double
      /**
                   * The total number of hits that were available for this search query.
                   */
      var totalHits: scala.Double
    }
    
  }
  
  @JSName("N1qlQueryResponse")
  @js.native
  object N1qlQueryResponseNs extends js.Object {
    /**
             * The meta-information available from a view query response.
             */
    
    trait Meta extends js.Object {
      /**
                   * The identifier for this query request.
                   */
      var requestID: scala.Double
    }
    
  }
  
  @JSName("ViewQueryResponse")
  @js.native
  object ViewQueryResponseNs extends js.Object {
    /**
             * The meta-information available from a view query response.
             */
    
    trait Meta extends js.Object {
      /**
                   * The total number of rows available in the index of the view that was queried.
                   */
      var total_rows: scala.Double
    }
    
  }
  
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
    /* error */ couchbaseLib.couchbaseMod.CouchbaseError | scala.Null, 
    /* rows */ js.Array[js.Any] | scala.Null, 
    /* meta */ couchbaseLib.couchbaseMod.BucketNs.FtsQueryResponseNs.Meta, 
    scala.Unit
  ]
  /**
       * Multi-Get Callback.
       * This callback is used to return results from a getMulti operation.
       */
  type MultiGetCallback = js.Function2[/* error */ scala.Double, /* results */ js.Array[js.Any], scala.Unit]
  /**
       * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
       */
  type N1qlQueryCallback = js.Function3[
    /* error */ couchbaseLib.couchbaseMod.CouchbaseError | scala.Null, 
    /* rows */ js.Array[js.Any] | scala.Null, 
    /* meta */ couchbaseLib.couchbaseMod.BucketNs.N1qlQueryResponseNs.Meta, 
    scala.Unit
  ]
  /**
       * Single-Key callbacks.
       * This callback is passed to all of the single key functions.
       * It returns a result objcet containing a combination of a CAS and a value, depending on which operation was invoked.
       */
  type OpCallback = js.Function2[
    /* error */ couchbaseLib.couchbaseMod.CouchbaseError | scala.Null, 
    /* result */ js.Any, 
    scala.Unit
  ]
  /**
       * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
       */
  type QueryCallback = js.Function3[
    /* error */ couchbaseLib.couchbaseMod.CouchbaseError | scala.Null, 
    /* rows */ js.Array[js.Any] | scala.Null, 
    /* meta */ couchbaseLib.couchbaseMod.BucketNs.ViewQueryResponseNs.Meta, 
    scala.Unit
  ]
}

