package typings.awsSdkS3RequestPresigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object presignerMod {
  
  /**
    * PartialBy<T, K> makes properties specified in K optional in interface T
    * see: https://stackoverflow.com/questions/43159887/make-a-single-property-optional-in-typescript
    * */
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type PartialBy[T, K /* <: /* keyof T */ java.lang.String */] = (typings.awsSdkS3RequestPresigner.presignerMod.Omit[T, K]) with (typings.std.Partial[typings.std.Pick[T, K]])
}
