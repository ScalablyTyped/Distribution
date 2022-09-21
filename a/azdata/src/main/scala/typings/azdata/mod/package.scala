package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.mod.^
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type ContainerProperties = ComponentProperties

type CssStyles = StringDictionary[String | Double]

type DivBuilder = ContainerBuilder[DivContainer, DivLayout, DivItemLayout, DivContainerProperties]

type EditCommitParams = IEditSessionOperationParams

type EditCreateRowParams = IEditSessionOperationParams

type EditDeleteRowParams = IEditRowOperationParams

type EditDisposeParams = IEditSessionOperationParams

type EditRevertCellResult = EditCellResult

type EditRevertRowParams = IEditRowOperationParams

type EditUpdateCellResult = EditCellResult

type FlexBuilder = ContainerBuilder[FlexContainer, FlexLayout, FlexItemLayout, ContainerProperties]

type FlexContainer = Container[FlexLayout, FlexItemLayout]

type FormContainer = Container[FormLayout, FormItemLayout]

type GroupBuilder = ContainerBuilder[GroupContainer, GroupLayout, GroupItemLayout, GroupContainerProperties]

type IconPath = String | Uri | ThemedIconPath

type ImageComponentProperties = ComponentWithIconProperties

type NavContainer = Container[Any, Any]

type SeparatorComponent = Component

type SeparatorComponentProperties = ComponentProperties

type SplitViewBuilder = ContainerBuilder[SplitViewContainer, SplitViewLayout, FlexItemLayout, ContainerProperties]

type SplitViewContainer = Container[SplitViewLayout, FlexItemLayout]

type ToolbarContainer = Container[ToolbarLayout, Any]
