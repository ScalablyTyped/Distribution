package typings.bayesClassifier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bayes-classifier", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BayesClassifier {
    
    /* CompleteClass */
    override def addDocument(doc: String, label: String): Unit = js.native
    
    /* CompleteClass */
    override def addDocuments(docs: js.Array[String], label: String): Unit = js.native
    
    /* CompleteClass */
    override def classify(doc: String): String = js.native
    
    /* CompleteClass */
    override def getClassifications(doc: String): Classifications = js.native
    
    /* CompleteClass */
    override def restore(classifier: Any): Unit = js.native
    
    /* CompleteClass */
    override def train(): Unit = js.native
  }
  
  trait BayesClassifier extends StObject {
    
    def addDocument(doc: String, label: String): Unit
    
    def addDocuments(docs: js.Array[String], label: String): Unit
    
    def classify(doc: String): String
    
    def getClassifications(doc: String): Classifications
    
    def restore(classifier: Any): Unit
    
    def train(): Unit
  }
  object BayesClassifier {
    
    inline def apply(
      addDocument: (String, String) => Unit,
      addDocuments: (js.Array[String], String) => Unit,
      classify: String => String,
      getClassifications: String => Classifications,
      restore: Any => Unit,
      train: () => Unit
    ): BayesClassifier = {
      val __obj = js.Dynamic.literal(addDocument = js.Any.fromFunction2(addDocument), addDocuments = js.Any.fromFunction2(addDocuments), classify = js.Any.fromFunction1(classify), getClassifications = js.Any.fromFunction1(getClassifications), restore = js.Any.fromFunction1(restore), train = js.Any.fromFunction0(train))
      __obj.asInstanceOf[BayesClassifier]
    }
    
    extension [Self <: BayesClassifier](x: Self) {
      
      inline def setAddDocument(value: (String, String) => Unit): Self = StObject.set(x, "addDocument", js.Any.fromFunction2(value))
      
      inline def setAddDocuments(value: (js.Array[String], String) => Unit): Self = StObject.set(x, "addDocuments", js.Any.fromFunction2(value))
      
      inline def setClassify(value: String => String): Self = StObject.set(x, "classify", js.Any.fromFunction1(value))
      
      inline def setGetClassifications(value: String => Classifications): Self = StObject.set(x, "getClassifications", js.Any.fromFunction1(value))
      
      inline def setRestore(value: Any => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
      
      inline def setTrain(value: () => Unit): Self = StObject.set(x, "train", js.Any.fromFunction0(value))
    }
  }
  
  trait Classifications extends StObject {
    
    var label: String
    
    var value: Double
  }
  object Classifications {
    
    inline def apply(label: String, value: Double): Classifications = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classifications]
    }
    
    extension [Self <: Classifications](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
