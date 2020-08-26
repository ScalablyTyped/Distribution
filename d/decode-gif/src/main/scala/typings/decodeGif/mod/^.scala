package typings.decodeGif.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decode-gif", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Decode the frames of a gif.
  @param data The gif data. Can be anything array-like such as a `Buffer`, `Array` or `Uint8Array`.
  @example
  ```
  const fs = require("fs");
  const decodeGif = require("decode-gif");
  decodeGif(fs.readFileSync("unicorn.gif"));
  / *
  {
    width: 220,
    height: 165,
    frames: [
    { timeCode: 0, data: [Uint8ClampedArray] },
  	{ timeCode: 10, data: [Uint8ClampedArray] },
  	...
    ]
  }
  *\/
  ```
  */
  def apply(data: ArrayLike[Double]): ResultType = js.native
}

