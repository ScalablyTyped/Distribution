package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeConstraint extends js.Object {
  /**
    * The type of comparison you want AWS WAF to perform. AWS WAF uses this in combination with the provided Size and FieldToMatch to build an expression in the form of "Size ComparisonOperator size in bytes of FieldToMatch". If that expression is true, the SizeConstraint is considered to match.  EQ: Used to test if the Size is equal to the size of the FieldToMatch   NE: Used to test if the Size is not equal to the size of the FieldToMatch   LE: Used to test if the Size is less than or equal to the size of the FieldToMatch   LT: Used to test if the Size is strictly less than the size of the FieldToMatch   GE: Used to test if the Size is greater than or equal to the size of the FieldToMatch   GT: Used to test if the Size is strictly greater than the size of the FieldToMatch 
    */
  var ComparisonOperator: typings.awsSdk.wafMod.ComparisonOperator = js.native
  /**
    * Specifies where in a web request to look for the size constraint.
    */
  var FieldToMatch: typings.awsSdk.wafMod.FieldToMatch = js.native
  /**
    * The size in bytes that you want AWS WAF to compare against the size of the specified FieldToMatch. AWS WAF uses this in combination with ComparisonOperator and FieldToMatch to build an expression in the form of "Size ComparisonOperator size in bytes of FieldToMatch". If that expression is true, the SizeConstraint is considered to match. Valid values for size are 0 - 21474836480 bytes (0 - 20 GB). If you specify URI for the value of Type, the / in the URI counts as one character. For example, the URI /logo.jpg is nine characters long.
    */
  var Size: typings.awsSdk.wafMod.Size = js.native
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on FieldToMatch before inspecting a request for a match. You can only specify a single type of TextTransformation. Note that if you choose BODY for the value of Type, you must choose NONE for TextTransformation because CloudFront forwards only the first 8192 bytes for inspection.   NONE  Specify NONE if you don't want to perform any text transformations.  CMD_LINE  When you're concerned that attackers are injecting an operating system command line command and using unusual formatting to disguise some or all of the command, use this option to perform the following transformations:   Delete the following characters: \ " ' ^   Delete spaces before the following characters: / (   Replace the following characters with a space: , ;   Replace multiple spaces with one space   Convert uppercase letters (A-Z) to lowercase (a-z)    COMPRESS_WHITE_SPACE  Use this option to replace the following characters with a space character (decimal 32):   \f, formfeed, decimal 12   \t, tab, decimal 9   \n, newline, decimal 10   \r, carriage return, decimal 13   \v, vertical tab, decimal 11   non-breaking space, decimal 160    COMPRESS_WHITE_SPACE also replaces multiple spaces with one space.  HTML_ENTITY_DECODE  Use this option to replace HTML-encoded characters with unencoded characters. HTML_ENTITY_DECODE performs the following operations:   Replaces (ampersand)quot; with "    Replaces (ampersand)nbsp; with a non-breaking space, decimal 160   Replaces (ampersand)lt; with a "less than" symbol   Replaces (ampersand)gt; with &gt;    Replaces characters that are represented in hexadecimal format, (ampersand)#xhhhh;, with the corresponding characters   Replaces characters that are represented in decimal format, (ampersand)#nnnn;, with the corresponding characters    LOWERCASE  Use this option to convert uppercase letters (A-Z) to lowercase (a-z).  URL_DECODE  Use this option to decode a URL-encoded value.
    */
  var TextTransformation: typings.awsSdk.wafMod.TextTransformation = js.native
}

object SizeConstraint {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    FieldToMatch: FieldToMatch,
    Size: Size,
    TextTransformation: TextTransformation
  ): SizeConstraint = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], FieldToMatch = FieldToMatch.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TextTransformation = TextTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SizeConstraint]
  }
}

