package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * <p>One or more values to evaluate against the supplied attribute. The number of values in
    *             the list depends on the <code>ComparisonOperator</code> being used.</p>
    *          <p>For type Number, value comparisons are numeric.</p>
    *          <p>String value comparisons for greater than, equals, or less than are based on ASCII
    *             character code values. For example, <code>a</code> is greater than <code>A</code>, and
    *                 <code>a</code> is greater than <code>B</code>. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.</p>
    *          <p>For Binary, DynamoDB treats each byte of the binary data as unsigned when it
    *             compares binary values.</p>
    */
  var AttributeValueList: js.UndefOr[js.Array[AttributeValue]] = js.undefined
  
  /**
    * <p>A comparator for evaluating attributes. For example, equals, greater than, less than,
    *             etc.</p>
    *          <p>The following comparison operators are available:</p>
    *          <p>
    *             <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS |
    *                 BEGINS_WITH | IN | BETWEEN</code>
    *          </p>
    *          <p>The following are descriptions of each comparison operator.</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>EQ</code> : Equal. <code>EQ</code> is supported for all data types,
    *                     including lists and maps.</p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain only one <code>AttributeValue</code>
    *                     element of type String, Number, Binary, String Set, Number Set, or Binary Set.
    *                     If an item contains an <code>AttributeValue</code> element of a different type
    *                     than the one provided in the request, the value does not match. For example,
    *                         <code>\{"S":"6"\}</code> does not equal <code>\{"N":"6"\}</code>. Also,
    *                         <code>\{"N":"6"\}</code> does not equal <code>\{"NS":["6", "2",
    *                     "1"]\}</code>.</p>
    *                <p></p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>NE</code> : Not equal. <code>NE</code> is supported for all data types,
    *                     including lists and maps.</p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain only one <code>AttributeValue</code>
    *                     of type String, Number, Binary, String Set, Number Set, or Binary Set. If an
    *                     item contains an <code>AttributeValue</code> of a different type than the one
    *                     provided in the request, the value does not match. For example,
    *                         <code>\{"S":"6"\}</code> does not equal <code>\{"N":"6"\}</code>. Also,
    *                         <code>\{"N":"6"\}</code> does not equal <code>\{"NS":["6", "2",
    *                     "1"]\}</code>.</p>
    *                <p></p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>LE</code> : Less than or equal. </p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain only one <code>AttributeValue</code>
    *                     element of type String, Number, or Binary (not a set type). If an item contains
    *                     an <code>AttributeValue</code> element of a different type than the one provided
    *                     in the request, the value does not match. For example, <code>\{"S":"6"\}</code>
    *                     does not equal <code>\{"N":"6"\}</code>. Also, <code>\{"N":"6"\}</code> does not
    *                     compare to <code>\{"NS":["6", "2", "1"]\}</code>.</p>
    *                <p></p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>LT</code> : Less than. </p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain only one <code>AttributeValue</code>
    *                     of type String, Number, or Binary (not a set type). If an item contains an
    *                         <code>AttributeValue</code> element of a different type than the one
    *                     provided in the request, the value does not match. For example,
    *                         <code>\{"S":"6"\}</code> does not equal <code>\{"N":"6"\}</code>. Also,
    *                         <code>\{"N":"6"\}</code> does not compare to <code>\{"NS":["6", "2",
    *                         "1"]\}</code>.</p>
    *                <p></p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>GE</code> : Greater than or equal. </p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain only one <code>AttributeValue</code>
    *                     element of type String, Number, or Binary (not a set type). If an item contains
    *                     an <code>AttributeValue</code> element of a different type than the one provided
    *                     in the request, the value does not match. For example, <code>\{"S":"6"\}</code>
    *                     does not equal <code>\{"N":"6"\}</code>. Also, <code>\{"N":"6"\}</code> does not
    *                     compare to <code>\{"NS":["6", "2", "1"]\}</code>.</p>
    *                <p></p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>GT</code> : Greater than. </p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain only one <code>AttributeValue</code>
    *                     element of type String, Number, or Binary (not a set type). If an item contains
    *                     an <code>AttributeValue</code> element of a different type than the one provided
    *                     in the request, the value does not match. For example, <code>\{"S":"6"\}</code>
    *                     does not equal <code>\{"N":"6"\}</code>. Also, <code>\{"N":"6"\}</code> does not
    *                     compare to <code>\{"NS":["6", "2", "1"]\}</code>.</p>
    *                <p></p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>NOT_NULL</code> : The attribute exists. <code>NOT_NULL</code> is supported
    *                     for all data types, including lists and maps.</p>
    *                <note>
    *                   <p>This operator tests for the existence of an attribute, not its data type.
    *                         If the data type of attribute "<code>a</code>" is null, and you evaluate it
    *                         using <code>NOT_NULL</code>, the result is a Boolean <code>true</code>. This
    *                         result is because the attribute "<code>a</code>" exists; its data type is
    *                         not relevant to the <code>NOT_NULL</code> comparison operator.</p>
    *                </note>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>NULL</code> : The attribute does not exist. <code>NULL</code> is supported
    *                     for all data types, including lists and maps.</p>
    *                <note>
    *                   <p>This operator tests for the nonexistence of an attribute, not its data
    *                         type. If the data type of attribute "<code>a</code>" is null, and you
    *                         evaluate it using <code>NULL</code>, the result is a Boolean
    *                             <code>false</code>. This is because the attribute "<code>a</code>"
    *                         exists; its data type is not relevant to the <code>NULL</code> comparison
    *                         operator.</p>
    *                </note>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>CONTAINS</code> : Checks for a subsequence, or value in a set.</p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain only one <code>AttributeValue</code>
    *                     element of type String, Number, or Binary (not a set type). If the target
    *                     attribute of the comparison is of type String, then the operator checks for a
    *                     substring match. If the target attribute of the comparison is of type Binary,
    *                     then the operator looks for a subsequence of the target that matches the input.
    *                     If the target attribute of the comparison is a set ("<code>SS</code>",
    *                         "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to
    *                     true if it finds an exact match with any member of the set.</p>
    *                <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS b</code>",
    *                         "<code>a</code>" can be a list; however, "<code>b</code>" cannot be a set, a
    *                     map, or a list.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or absence of a
    *                     value in a set.</p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain only one <code>AttributeValue</code>
    *                     element of type String, Number, or Binary (not a set type). If the target
    *                     attribute of the comparison is a String, then the operator checks for the
    *                     absence of a substring match. If the target attribute of the comparison is
    *                     Binary, then the operator checks for the absence of a subsequence of the target
    *                     that matches the input. If the target attribute of the comparison is a set
    *                         ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the
    *                     operator evaluates to true if it <i>does not</i> find an exact
    *                     match with any member of the set.</p>
    *                <p>NOT_CONTAINS is supported for lists: When evaluating "<code>a NOT CONTAINS
    *                         b</code>", "<code>a</code>" can be a list; however, "<code>b</code>" cannot
    *                     be a set, a map, or a list.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>BEGINS_WITH</code> : Checks for a prefix. </p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain only one <code>AttributeValue</code>
    *                     of type String or Binary (not a Number or a set type). The target attribute of
    *                     the comparison must be of type String or Binary (not a Number or a set
    *                     type).</p>
    *                <p></p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>IN</code> : Checks for matching elements in a list.</p>
    *                <p>
    *                   <code>AttributeValueList</code> can contain one or more
    *                         <code>AttributeValue</code> elements of type String, Number, or Binary.
    *                     These attributes are compared against an existing attribute of an item. If any
    *                     elements of the input are equal to the item attribute, the expression evaluates
    *                     to true.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>BETWEEN</code> : Greater than or equal to the first value, and less than
    *                     or equal to the second value. </p>
    *                <p>
    *                   <code>AttributeValueList</code> must contain two <code>AttributeValue</code>
    *                     elements of the same type, either String, Number, or Binary (not a set type). A
    *                     target attribute matches if the target value is greater than, or equal to, the
    *                     first element and less than, or equal to, the second element. If an item
    *                     contains an <code>AttributeValue</code> element of a different type than the one
    *                     provided in the request, the value does not match. For example,
    *                         <code>\{"S":"6"\}</code> does not compare to <code>\{"N":"6"\}</code>. Also,
    *                         <code>\{"N":"6"\}</code> does not compare to <code>\{"NS":["6", "2",
    *                         "1"]\}</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>For usage examples of <code>AttributeValueList</code> and
    *                 <code>ComparisonOperator</code>, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy
    *                 Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ComparisonOperator: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ComparisonOperator | String
  ] = js.undefined
}
object Condition {
  
  inline def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    inline def setAttributeValueList(value: js.Array[AttributeValue]): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
    
    inline def setAttributeValueListVarargs(value: AttributeValue*): Self = StObject.set(x, "AttributeValueList", js.Array(value*))
    
    inline def setComparisonOperator(value: ComparisonOperator | String): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
  }
}
