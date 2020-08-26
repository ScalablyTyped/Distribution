package typings.couchbase.mod.Bucket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CAS value is a special object that indicates the current state of the item on the server. Each time an object is mutated on the server, the value is changed. CAS objects can be used in conjunction with mutation operations to ensure that the value on the server matches the local value retrieved by the client. This is useful when doing document updates on the server as you can ensure no changes were applied by other clients while you were in the process of mutating the document locally.
  * In the Node.js SDK, the CAS is represented as an opaque value. As such, you cannot generate CAS objects, but should rather use the values returned from a Bucket.OpCallback.
  */
@js.native
trait CAS extends js.Object

