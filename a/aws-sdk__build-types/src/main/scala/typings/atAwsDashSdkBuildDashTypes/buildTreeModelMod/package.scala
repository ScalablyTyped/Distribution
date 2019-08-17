package typings.atAwsDashSdkBuildDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTreeModelMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atAwsDashSdkTypes.buildProtocolMod.Blob
  import typings.atAwsDashSdkTypes.buildProtocolMod.Boolean
  import typings.atAwsDashSdkTypes.buildProtocolMod.Float
  import typings.atAwsDashSdkTypes.buildProtocolMod.Integer
  import typings.atAwsDashSdkTypes.buildProtocolMod.Timestamp

  type NamedAndDocumented[T] = Documented with Named with T
  type NormalizedOperationMap = StringDictionary[NormalizedOperation]
  type TreeModelOperationMap = StringDictionary[TreeModelOperation]
  type TreeModelShape = NamedAndDocumented[
    Blob | Boolean | Float | Integer | Timestamp | TreeModelString | TreeModelList | TreeModelMap | TreeModelStructure
  ]
  type TreeModelShapeMap = StringDictionary[TreeModelShape]
}
