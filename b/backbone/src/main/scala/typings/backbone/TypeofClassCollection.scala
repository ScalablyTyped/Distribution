package typings.backbone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassCollection
  extends Instantiable0[Collection[Model]]
     with Instantiable1[
      /* models */ js.Array[
        (/* import warning: RewrittenClass.unapply cls was tparam TModel */ js.Any) | js.Object
      ], 
      Collection[Model]
    ]
     with Instantiable2[
      /* models */ js.Array[
        (/* import warning: RewrittenClass.unapply cls was tparam TModel */ js.Any) | js.Object
      ], 
      /* options */ js.Any, 
      Collection[Model]
    ] {
  /**
    * Do not use, prefer TypeScript's extend functionality.
    **/
  def extend(properties: js.Any): js.Any = js.native
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
}

