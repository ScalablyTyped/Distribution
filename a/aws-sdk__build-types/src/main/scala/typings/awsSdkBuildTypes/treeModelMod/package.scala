package typings.awsSdkBuildTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeModelMod {
  type NamedAndDocumented[T] = typings.awsSdkBuildTypes.treeModelMod.Documented with typings.awsSdkBuildTypes.treeModelMod.Named with T
  type NormalizedOperationMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdkBuildTypes.treeModelMod.NormalizedOperation]
  type TreeModelOperationMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdkBuildTypes.treeModelMod.TreeModelOperation]
  type TreeModelShape = typings.awsSdkBuildTypes.treeModelMod.NamedAndDocumented[
    typings.awsSdkTypes.protocolMod.Blob | typings.awsSdkTypes.protocolMod.Boolean | typings.awsSdkTypes.protocolMod.Float | typings.awsSdkTypes.protocolMod.Integer | typings.awsSdkTypes.protocolMod.Timestamp | typings.awsSdkBuildTypes.treeModelMod.TreeModelString | typings.awsSdkBuildTypes.treeModelMod.TreeModelList | typings.awsSdkBuildTypes.treeModelMod.TreeModelMap | typings.awsSdkBuildTypes.treeModelMod.TreeModelStructure
  ]
  type TreeModelShapeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdkBuildTypes.treeModelMod.TreeModelShape]
}
