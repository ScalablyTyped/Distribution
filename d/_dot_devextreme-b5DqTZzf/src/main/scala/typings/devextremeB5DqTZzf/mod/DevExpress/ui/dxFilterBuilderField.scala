package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.AllowClearing
import typings.devextremeB5DqTZzf.anon.Value
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.Equalssign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.Greaterthansign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.GreaterthansignEqualssign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.Lessthansign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.LessthansignEqualssign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.LessthansignGreaterthansign
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`object`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.between
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.boolean_
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.contains
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.date
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.datetime
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.endswith
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.isblank
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.isnotblank
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.notcontains
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.number
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.startswith
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.string_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFilterBuilder.FieldEditorTemplate
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFilterBuilderField extends StObject {
  
  /**
    * Specifies the field&apos;s custom rules to filter data.
    */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ Any, 
      /* selectedFilterOperation */ String, 
      String | js.Array[Any] | js.Function
    ]
  ] = js.undefined
  
  /**
    * Specifies the data field&apos;s caption.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Customizes the input value&apos;s display text.
    */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ Value, String]] = js.undefined
  
  /**
    * Specifies the name of a field to be filtered.
    */
  var dataField: js.UndefOr[String] = js.undefined
  
  /**
    * Casts field values to a specific data type.
    */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.undefined
  
  /**
    * Configures the UI component used to edit the field value.
    */
  var editorOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the editor&apos;s custom template.
    */
  var editorTemplate: js.UndefOr[
    template | (js.Function2[
      /* conditionInfo */ FieldEditorTemplate, 
      /* container */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the false value text. Applies only if dataType is &apos;boolean&apos;.
    */
  var falseText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a set of available filter operations.
    */
  var filterOperations: js.UndefOr[
    js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
    ]
  ] = js.undefined
  
  /**
    * Formats a value before it is displayed.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Configures the lookup field.
    */
  var lookup: js.UndefOr[AllowClearing] = js.undefined
  
  /**
    * Specifies the field&apos;s name. Use it to distinguish the field from other fields when they have identical dataField values.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the true value text. Applies only if dataType is &apos;boolean&apos;.
    */
  var trueText: js.UndefOr[String] = js.undefined
}
object dxFilterBuilderField {
  
  inline def apply(): dxFilterBuilderField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderField]
  }
  
  extension [Self <: dxFilterBuilderField](x: Self) {
    
    inline def setCalculateFilterExpression(
      value: (/* filterValue */ Any, /* selectedFilterOperation */ String) => String | js.Array[Any] | js.Function
    ): Self = StObject.set(x, "calculateFilterExpression", js.Any.fromFunction2(value))
    
    inline def setCalculateFilterExpressionUndefined: Self = StObject.set(x, "calculateFilterExpression", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCustomizeText(value: /* fieldInfo */ Value => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDataType(value: string_ | number | date | boolean_ | `object` | datetime): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
    
    inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
    
    inline def setEditorTemplate(
      value: template | (js.Function2[
          /* conditionInfo */ FieldEditorTemplate, 
          /* container */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "editorTemplate", value.asInstanceOf[js.Any])
    
    inline def setEditorTemplateFunction2(
      value: (/* conditionInfo */ FieldEditorTemplate, /* container */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "editorTemplate", js.Any.fromFunction2(value))
    
    inline def setEditorTemplateUndefined: Self = StObject.set(x, "editorTemplate", js.undefined)
    
    inline def setFalseText(value: String): Self = StObject.set(x, "falseText", value.asInstanceOf[js.Any])
    
    inline def setFalseTextUndefined: Self = StObject.set(x, "falseText", js.undefined)
    
    inline def setFilterOperations(
      value: js.Array[
          Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
        ]
    ): Self = StObject.set(x, "filterOperations", value.asInstanceOf[js.Any])
    
    inline def setFilterOperationsUndefined: Self = StObject.set(x, "filterOperations", js.undefined)
    
    inline def setFilterOperationsVarargs(
      value: (Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String)*
    ): Self = StObject.set(x, "filterOperations", js.Array(value*))
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLookup(value: AllowClearing): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTrueText(value: String): Self = StObject.set(x, "trueText", value.asInstanceOf[js.Any])
    
    inline def setTrueTextUndefined: Self = StObject.set(x, "trueText", js.undefined)
  }
}
