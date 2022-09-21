package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTransformation extends StObject {
  
  /**
    * Sets the relative processing order for multiple transformations that are defined for a rule statement. WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content. The priorities don't need to be consecutive, but they must all be different. 
    */
  var Priority: TextTransformationPriority
  
  /**
    * You can specify the following transformation types:  BASE64_DECODE - Decode a Base64-encoded string.  BASE64_DECODE_EXT - Decode a Base64-encoded string, but use a forgiving implementation that ignores characters that aren't valid.  CMD_LINE - Command-line transformations. These are helpful in reducing effectiveness of attackers who inject an operating system command-line command and use unusual formatting to disguise some or all of the command.    Delete the following characters: \ " ' ^    Delete spaces before the following characters: / (    Replace the following characters with a space: , ;    Replace multiple spaces with one space   Convert uppercase letters (A-Z) to lowercase (a-z)    COMPRESS_WHITE_SPACE - Replace these characters with a space character (decimal 32):     \f, formfeed, decimal 12    \t, tab, decimal 9    \n, newline, decimal 10    \r, carriage return, decimal 13    \v, vertical tab, decimal 11   Non-breaking space, decimal 160    COMPRESS_WHITE_SPACE also replaces multiple spaces with one space.  CSS_DECODE - Decode characters that were encoded using CSS 2.x escape rules syndata.html#characters. This function uses up to two bytes in the decoding process, so it can help to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be encoded. It's also useful in countering evasion, which is a combination of a backslash and non-hexadecimal characters. For example, ja\vascript for javascript.   ESCAPE_SEQ_DECODE - Decode the following ANSI C escape sequences: \a, \b, \f, \n, \r, \t, \v, \\, \?, \', \", \xHH (hexadecimal), \0OOO (octal). Encodings that aren't valid remain in the output.   HEX_DECODE - Decode a string of hexadecimal characters into a binary.  HTML_ENTITY_DECODE - Replace HTML-encoded characters with unencoded characters. HTML_ENTITY_DECODE performs these operations:    Replaces (ampersand)quot; with "    Replaces (ampersand)nbsp; with a non-breaking space, decimal 160   Replaces (ampersand)lt; with a "less than" symbol   Replaces (ampersand)gt; with &gt;    Replaces characters that are represented in hexadecimal format, (ampersand)#xhhhh;, with the corresponding characters   Replaces characters that are represented in decimal format, (ampersand)#nnnn;, with the corresponding characters    JS_DECODE - Decode JavaScript escape sequences. If a \ u HHHH code is in the full-width ASCII code range of FF01-FF5E, then the higher byte is used to detect and adjust the lower byte. If not, only the lower byte is used and the higher byte is zeroed, causing a possible loss of information.   LOWERCASE - Convert uppercase letters (A-Z) to lowercase (a-z).   MD5 - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.   NONE - Specify NONE if you don't want any text transformations.   NORMALIZE_PATH - Remove multiple slashes, directory self-references, and directory back-references that are not at the beginning of the input from an input string.   NORMALIZE_PATH_WIN - This is the same as NORMALIZE_PATH, but first converts backslash characters to forward slashes.   REMOVE_NULLS - Remove all NULL bytes from the input.   REPLACE_COMMENTS - Replace each occurrence of a C-style comment (/ * ... *) with a single space. Multiple consecutive occurrences are not compressed. Unterminated comments are also replaced with a space (ASCII 0x20). However, a standalone termination of a comment (*) is not acted upon.   REPLACE_NULLS - Replace NULL bytes in the input with space characters (ASCII 0x20).   SQL_HEX_DECODE - Decode SQL hex data. Example (0x414243) will be decoded to (ABC).  URL_DECODE - Decode a URL-encoded value.   URL_DECODE_UNI - Like URL_DECODE, but with support for Microsoft-specific %u encoding. If the code is in the full-width ASCII code range of FF01-FF5E, the higher byte is used to detect and adjust the lower byte. Otherwise, only the lower byte is used and the higher byte is zeroed.   UTF8_TO_UNICODE - Convert all UTF-8 character sequences to Unicode. This helps input normalization, and minimizing false-positives and false-negatives for non-English languages.
    */
  var Type: TextTransformationType
}
object TextTransformation {
  
  inline def apply(Priority: TextTransformationPriority, Type: TextTransformationType): TextTransformation = {
    val __obj = js.Dynamic.literal(Priority = Priority.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTransformation]
  }
  
  extension [Self <: TextTransformation](x: Self) {
    
    inline def setPriority(value: TextTransformationPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setType(value: TextTransformationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
