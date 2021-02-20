package typings.bayesClassifier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bayes-classifier", JSImport.Namespace)
  @js.native
  class ^ () extends BayesClassifier
  
  @js.native
  trait BayesClassifier extends StObject {
    
    def addDocument(doc: String, label: String): Unit = js.native
    
    def addDocuments(docs: js.Array[String], label: String): Unit = js.native
    
    def classify(doc: String): String = js.native
    
    def getClassifications(doc: String): Classifications = js.native
    
    def restore(classifier: js.Any): Unit = js.native
    
    def train(): Unit = js.native
  }
  object BayesClassifier {
    
    @scala.inline
    def apply(
      addDocument: (String, String) => Unit,
      addDocuments: (js.Array[String], String) => Unit,
      classify: String => String,
      getClassifications: String => Classifications,
      restore: js.Any => Unit,
      train: () => Unit
    ): BayesClassifier = {
      val __obj = js.Dynamic.literal(addDocument = js.Any.fromFunction2(addDocument), addDocuments = js.Any.fromFunction2(addDocuments), classify = js.Any.fromFunction1(classify), getClassifications = js.Any.fromFunction1(getClassifications), restore = js.Any.fromFunction1(restore), train = js.Any.fromFunction0(train))
      __obj.asInstanceOf[BayesClassifier]
    }
    
    @scala.inline
    implicit class BayesClassifierMutableBuilder[Self <: BayesClassifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDocument(value: (String, String) => Unit): Self = StObject.set(x, "addDocument", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddDocuments(value: (js.Array[String], String) => Unit): Self = StObject.set(x, "addDocuments", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClassify(value: String => String): Self = StObject.set(x, "classify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetClassifications(value: String => Classifications): Self = StObject.set(x, "getClassifications", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRestore(value: js.Any => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrain(value: () => Unit): Self = StObject.set(x, "train", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Classifications extends StObject {
    
    var label: String = js.native
    
    var value: Double = js.native
  }
  object Classifications {
    
    @scala.inline
    def apply(label: String, value: Double): Classifications = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classifications]
    }
    
    @scala.inline
    implicit class ClassificationsMutableBuilder[Self <: Classifications] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
