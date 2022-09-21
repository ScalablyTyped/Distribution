package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.anon.Desc
import typings.devextremeB5DqTZzf.anon.SummaryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FilterDescriptor = Any

type GroupDescriptor[T] = KeySelector[T] | (BaseGroupDescriptor[T] & Desc)

/**
  * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
  */
type KeySelector[T] = String | (js.Function1[/* source */ T, String | Double | js.Date | js.Object])

type SelectDescriptor[T] = String | js.Array[String] | (js.Function1[/* source */ T, Any])

type SortDescriptor[T] = GroupDescriptor[T]

type SummaryDescriptor[T] = KeySelector[T] | (BaseGroupDescriptor[T] & SummaryType)
