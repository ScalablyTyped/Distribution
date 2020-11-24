package typings.awsSdkBuildTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object treeModelMod {
  
  type NamedAndDocumented[T] = typings.awsSdkBuildTypes.treeModelMod.Documented with typings.awsSdkBuildTypes.treeModelMod.Named with T
  
  type NormalizedOperationMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdkBuildTypes.treeModelMod.NormalizedOperation]
  
  type TreeModelOperationMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdkBuildTypes.treeModelMod.TreeModelOperation]
  
  type TreeModelShape = typings.awsSdkBuildTypes.treeModelMod.NamedAndDocumented[
    typings.std.Blob | scala.Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float */ js.Any) | typings.awsSdkBuildTypes.treeModelMod.TreeModelString | typings.awsSdkBuildTypes.treeModelMod.TreeModelList | typings.awsSdkBuildTypes.treeModelMod.TreeModelMap | typings.awsSdkBuildTypes.treeModelMod.TreeModelStructure
  ]
  
  type TreeModelShapeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdkBuildTypes.treeModelMod.TreeModelShape]
}
